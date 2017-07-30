package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass383 {

    @Ignore    private SampleClass384 sampleClass;

    public SampleClass383(){
        sampleClass = new SampleClass384();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}