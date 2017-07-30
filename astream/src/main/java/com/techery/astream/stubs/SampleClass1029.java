package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1029 {

    @Ignore    private SampleClass1030 sampleClass;

    public SampleClass1029(){
        sampleClass = new SampleClass1030();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}