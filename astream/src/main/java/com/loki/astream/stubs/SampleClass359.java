package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass359 {

    @Ignore    private SampleClass360 sampleClass;

    public SampleClass359(){
        sampleClass = new SampleClass360();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}