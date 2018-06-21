<template>
    <div class="container">
         <div class="row">
            <dp-header></dp-header>
            <!-- <h1 @onServerSelected="server = $event">ID:{{server.id}} , Status:{{server.status}}</h1> -->
         </div>
        <hr>
         <div class="row">
            <dp-table></dp-table>
            <dp-status>
                 <h1 slot = "head">hello</h1>
                 <h2 slot = "foot">Bye</h2>
            </dp-status>
          </div>
        <hr>
         <div class="row">
            <dp-footer></dp-footer>
         </div>
    </div>
</template>

<script>
    import Table from './TableServer.vue'
    import Status from './Status.vue'
    import Header from './Header.vue'
    import Footer from './Footer.vue'
    

    export default{
        components: {
            'dp-table': Table,
            'dp-status': Status,
            'dp-header': Header,
            'dp-footer': Footer,
        }
    }
</script>

