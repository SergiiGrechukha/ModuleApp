package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass693 {

    @Ignore    private SampleClass694 sampleClass;

    public SampleClass693(){
        sampleClass = new SampleClass694();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}