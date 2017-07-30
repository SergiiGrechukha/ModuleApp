package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass45 {

    @Ignore    private SampleClass46 sampleClass;

    public SampleClass45(){
        sampleClass = new SampleClass46();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}