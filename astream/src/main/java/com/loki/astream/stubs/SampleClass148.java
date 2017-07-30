package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass148 {

    @Ignore    private SampleClass149 sampleClass;

    public SampleClass148(){
        sampleClass = new SampleClass149();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}