package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1718 {

    @Ignore    private SampleClass1719 sampleClass;

    public SampleClass1718(){
        sampleClass = new SampleClass1719();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}