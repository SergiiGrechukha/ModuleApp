package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass878 {

    @Ignore    private SampleClass879 sampleClass;

    public SampleClass878(){
        sampleClass = new SampleClass879();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}