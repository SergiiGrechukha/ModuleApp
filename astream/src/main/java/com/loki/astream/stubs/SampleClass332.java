package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass332 {

    @Ignore    private SampleClass333 sampleClass;

    public SampleClass332(){
        sampleClass = new SampleClass333();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}