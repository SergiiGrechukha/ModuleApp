package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1157 {

    @Ignore    private SampleClass1158 sampleClass;

    public SampleClass1157(){
        sampleClass = new SampleClass1158();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}