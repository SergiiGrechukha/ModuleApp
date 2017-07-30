package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass184 {

    @Ignore    private SampleClass185 sampleClass;

    public SampleClass184(){
        sampleClass = new SampleClass185();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}