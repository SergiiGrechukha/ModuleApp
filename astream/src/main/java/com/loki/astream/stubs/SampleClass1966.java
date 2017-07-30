package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1966 {

    @Ignore    private SampleClass1967 sampleClass;

    public SampleClass1966(){
        sampleClass = new SampleClass1967();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}