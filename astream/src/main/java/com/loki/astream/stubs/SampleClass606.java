package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass606 {

    @Ignore    private SampleClass607 sampleClass;

    public SampleClass606(){
        sampleClass = new SampleClass607();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}