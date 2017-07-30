package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass614 {

    @Ignore    private SampleClass615 sampleClass;

    public SampleClass614(){
        sampleClass = new SampleClass615();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}