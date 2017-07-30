package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass613 {

    @Ignore    private SampleClass614 sampleClass;

    public SampleClass613(){
        sampleClass = new SampleClass614();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}