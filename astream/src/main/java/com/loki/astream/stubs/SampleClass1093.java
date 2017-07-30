package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1093 {

    @Ignore    private SampleClass1094 sampleClass;

    public SampleClass1093(){
        sampleClass = new SampleClass1094();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}