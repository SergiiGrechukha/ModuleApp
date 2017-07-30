package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1719 {

    @Ignore    private SampleClass1720 sampleClass;

    public SampleClass1719(){
        sampleClass = new SampleClass1720();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}