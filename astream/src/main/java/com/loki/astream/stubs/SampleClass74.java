package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass74 {

    @Ignore    private SampleClass75 sampleClass;

    public SampleClass74(){
        sampleClass = new SampleClass75();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}