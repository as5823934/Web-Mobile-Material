<template>
  <div class="col-xs-12 col-sm-6">
      <!-- <h1>{{ selectedServer }}</h1> -->
            <ul class="list-group">
                <!-- <li class="list-group-item" v-for="index in 5">
                    Server #{{ index }}
                </li> -->
                <server @onServerSelected="ServerSelected=$event" v-for="server in servers" 
                :server="server" :key="server.id"></server>
            </ul>
    </div>
</template>

<script>
    import Server from './Server.vue'
     export default {
        data() {
            return {
                servers: [{ id: 1, status: "Normal" }, 
                          { id: 2, status: "Critical" },
                          { id: 3, status: "Error" },
                          { id: 4, status: "Normal" },
                          { id: 5, status: "Critical" }],
                // selectedServer: null
            }
        },
        components: {
            Server
        }     
    }
</script>
<style> 

</style>