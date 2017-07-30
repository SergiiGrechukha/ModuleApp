package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1174 {

    @Ignore    private SampleClass1175 sampleClass;

    public SampleClass1174(){
        sampleClass = new SampleClass1175();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}