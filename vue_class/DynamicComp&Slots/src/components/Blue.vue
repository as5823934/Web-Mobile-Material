<template>
    <div>
        <slot></slot>
        <p>{{count}}</p>
        <button @click="incrementCounter">Increment</button>
    </div>
</template>

<script>
export default {
  data() {
    return {
      count: 1
    };
  },
  methods: {
    incrementCounter() {
      this.count++;
    }
  },
  destroyed() {
    alert("Component destroyed!");
  },
  activated() {},
  deactivated() {
    alert("Deactivated!");
  }
};
</script>

<style scoped>
div {
  border: 1px solid blue;
  background-color: lightblue;
  padding: 30px;
  margin: 20px auto;
  text-align: center;
}
</style>