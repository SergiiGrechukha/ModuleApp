package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1684 {

    @Ignore    private SampleClass1685 sampleClass;

    public SampleClass1684(){
        sampleClass = new SampleClass1685();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}