<template>
  <div class="m-3">
    <h1 class="text-4xl py-3 text-blue-600 font-bold">Hello world</h1>  
    <span class="text-xl py-3 text-gray-500">{{ response }}</span>

    <ul>
      <li class="text-xl text-gray-500" v-for="person in persons" :key="persons.fname">
        <span class="font-bold">{{ person.fname }}</span> .{{ person.lname }}
      </li>
    </ul>
  </div>
  
</template>
<script setup>
import apiClient from './api/axios.js'
import { ref, onMounted } from 'vue'
import { NButton } from 'naive-ui'

const persons = ref([])

onMounted(()=>{
  apiClient.get('/api/greet').then(res => {
      persons.value = res.data      
    }).catch(error =>{
    })
})

</script>
<style scoped>
</style>
