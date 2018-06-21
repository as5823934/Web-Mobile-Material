<template>
    <div class="container">
        <div class="row">
            <div class="col-xs-12">
                <br>
                <button class="btn btn-primary" @click="selecetedComponent='app-blue'">Load Blue Template</button>
                <button class="btn btn-success" @click="selecetedComponent='app-green'">Load Green Template</button>
                <button class="btn btn-danger" @click="selecetedComponent='app-red'">Load Red Template</button>
                <hr>
                <keep-alive>
                    <component :is="selecetedComponent">
                        <h1>This is {{ selecetedComponent }}</h1>
                    </component>
                </keep-alive>
                <!-- <app-blue></app-blue>
                <app-green></app-green>
                <app-red></app-red> -->
            </div>
        </div>
    </div>
</template>

<script>
import Blue from "./components/Blue.vue";
import Green from "./components/Green.vue";
import Red from "./components/Red.vue";

export default {
  data() {
    return {
      selecetedComponent: ""
    };
  },
  components: {
    appBlue: Blue,
    appGreen: Green,
    appRed: Red
  }
};
</script>

<style>

</style>
