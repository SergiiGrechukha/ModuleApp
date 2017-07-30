package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass570 {

    @Ignore    private SampleClass571 sampleClass;

    public SampleClass570(){
        sampleClass = new SampleClass571();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}