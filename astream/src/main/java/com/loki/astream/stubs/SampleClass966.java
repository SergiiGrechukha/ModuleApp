package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass966 {

    @Ignore    private SampleClass967 sampleClass;

    public SampleClass966(){
        sampleClass = new SampleClass967();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}