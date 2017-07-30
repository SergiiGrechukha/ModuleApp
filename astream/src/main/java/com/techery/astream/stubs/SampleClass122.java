package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass122 {

    @Ignore    private SampleClass123 sampleClass;

    public SampleClass122(){
        sampleClass = new SampleClass123();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}