package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass533 {

    @Ignore    private SampleClass534 sampleClass;

    public SampleClass533(){
        sampleClass = new SampleClass534();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}