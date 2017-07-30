package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass140 {

    @Ignore    private SampleClass141 sampleClass;

    public SampleClass140(){
        sampleClass = new SampleClass141();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}