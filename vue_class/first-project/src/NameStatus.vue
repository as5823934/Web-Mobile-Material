<template>
  <div>
    <p>Hello, {{ name }}</p>
    <button @click="changeName">Change Name</button>
</div>
</template>

<script>
export default {
  data(){ // = data: function()
    return {
      name: 'Derrick',
    }
  },
  methods:{
    changeName(){
      this.name = "World";
    }
  },
}
</script>
