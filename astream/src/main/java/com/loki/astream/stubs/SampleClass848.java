package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass848 {

    @Ignore    private SampleClass849 sampleClass;

    public SampleClass848(){
        sampleClass = new SampleClass849();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}