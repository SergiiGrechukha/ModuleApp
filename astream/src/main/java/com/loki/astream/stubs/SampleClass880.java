package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass880 {

    @Ignore    private SampleClass881 sampleClass;

    public SampleClass880(){
        sampleClass = new SampleClass881();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}