package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass259 {

    @Ignore    private SampleClass260 sampleClass;

    public SampleClass259(){
        sampleClass = new SampleClass260();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}