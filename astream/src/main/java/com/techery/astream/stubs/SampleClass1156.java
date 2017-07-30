package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1156 {

    @Ignore    private SampleClass1157 sampleClass;

    public SampleClass1156(){
        sampleClass = new SampleClass1157();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}