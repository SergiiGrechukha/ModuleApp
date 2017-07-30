package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1175 {

    @Ignore    private SampleClass1176 sampleClass;

    public SampleClass1175(){
        sampleClass = new SampleClass1176();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}