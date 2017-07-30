package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1778 {

    @Ignore    private SampleClass1779 sampleClass;

    public SampleClass1778(){
        sampleClass = new SampleClass1779();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}