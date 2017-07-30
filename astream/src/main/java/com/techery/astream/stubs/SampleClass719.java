package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass719 {

    @Ignore    private SampleClass720 sampleClass;

    public SampleClass719(){
        sampleClass = new SampleClass720();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}