package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1023 {

    @Ignore    private SampleClass1024 sampleClass;

    public SampleClass1023(){
        sampleClass = new SampleClass1024();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}