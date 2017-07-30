package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass972 {

    @Ignore    private SampleClass973 sampleClass;

    public SampleClass972(){
        sampleClass = new SampleClass973();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}