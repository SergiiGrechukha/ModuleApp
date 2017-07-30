package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass921 {

    @Ignore    private SampleClass922 sampleClass;

    public SampleClass921(){
        sampleClass = new SampleClass922();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}