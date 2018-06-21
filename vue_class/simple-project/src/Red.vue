<template>
  <div>
      <slot></slot>
  </div>
</template>

<script>
export default {
    data(){
        return{
            count: 1,
        }
    },

    methods: {
        increment(){
            this.count++;
        }
    },
    
    destroyed() {
        alert("Component destroyed!");
    }
}
</script>

<style scoped>

</style>
