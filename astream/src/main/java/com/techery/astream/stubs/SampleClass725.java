package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass725 {

    @Ignore    private SampleClass726 sampleClass;

    public SampleClass725(){
        sampleClass = new SampleClass726();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}