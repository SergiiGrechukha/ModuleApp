package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass886 {

    @Ignore    private SampleClass887 sampleClass;

    public SampleClass886(){
        sampleClass = new SampleClass887();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}