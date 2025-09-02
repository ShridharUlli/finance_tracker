import axios from 'axios';
// const apiClient = axios.create({
//     baseURL: 'http://localhost:8080',
//     headers: {
//     'Content-Type': 'application/json',
//   },
// })


const apiClient = {
  get: (url)=>{
    debugger
    return Promise.resolve({
      data: [
        {lname: "U", fname: 'Shridhar'},
        {lname: "T", fname: 'Harshitha'},
      ]
    })
  },
  post:(url)=>{ Promise.resolve({data: {}})},
  put:(url)=>{ Promise.resolve({data: {}})},
  delete:(url)=>{ Promise.resolve({data: {}})},
}
export default apiClient;