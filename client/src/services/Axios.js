import axios from 'axios';
const BASE_URL = 'https://localhost:8443';


export default axios.create({
    baseURL: BASE_URL
});

// attaches the JWT token to the instance of axios we create
export const axiosPrivate = axios.create({
    baseURL: BASE_URL,
    headers: { 'Content-Type': 'application/json', 'Access-Control-Allow-Origin': 'https://localhost:8443' },
    withCredentials: true
});