package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass915 {

    @Ignore    private SampleClass916 sampleClass;

    public SampleClass915(){
        sampleClass = new SampleClass916();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}