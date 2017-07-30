package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass102 {

    @Ignore    private SampleClass103 sampleClass;

    public SampleClass102(){
        sampleClass = new SampleClass103();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}