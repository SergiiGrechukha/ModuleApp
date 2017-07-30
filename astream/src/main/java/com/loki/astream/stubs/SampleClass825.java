package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass825 {

    @Ignore    private SampleClass826 sampleClass;

    public SampleClass825(){
        sampleClass = new SampleClass826();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}