<template>
  <div class="m-3">
    <h1 class="text-4xl py-3 text-blue-600 font-bold">Hello worlds</h1>  
    <span class="text-xl py-3 text-gray-500">{{ response }}</span>
  </div>
  
</template>
<script setup>
import apiClient from './api/axios.js'
import { ref, onMounted } from 'vue'
import { NButton } from 'naive-ui'

const response = ref('test')

onMounted(()=>{
  apiClient.get('/api/greet').then(res => {
      response.value = res.data
    }).catch(error =>{
    })
})

</script>
<style scoped>
</style>
