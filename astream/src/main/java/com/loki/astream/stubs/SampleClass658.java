package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass658 {

    @Ignore    private SampleClass659 sampleClass;

    public SampleClass658(){
        sampleClass = new SampleClass659();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}