package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass660 {

    @Ignore    private SampleClass661 sampleClass;

    public SampleClass660(){
        sampleClass = new SampleClass661();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}