package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass72 {

    @Ignore    private SampleClass73 sampleClass;

    public SampleClass72(){
        sampleClass = new SampleClass73();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}