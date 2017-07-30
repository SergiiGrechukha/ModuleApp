package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass879 {

    @Ignore    private SampleClass880 sampleClass;

    public SampleClass879(){
        sampleClass = new SampleClass880();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}