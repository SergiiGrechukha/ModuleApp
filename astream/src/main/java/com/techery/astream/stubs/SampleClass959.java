package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass959 {

    @Ignore    private SampleClass960 sampleClass;

    public SampleClass959(){
        sampleClass = new SampleClass960();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}