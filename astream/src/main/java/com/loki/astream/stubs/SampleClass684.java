package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass684 {

    @Ignore    private SampleClass685 sampleClass;

    public SampleClass684(){
        sampleClass = new SampleClass685();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}